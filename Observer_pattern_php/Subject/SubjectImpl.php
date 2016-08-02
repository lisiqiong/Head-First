<?php

/**
 * 具体主题类
 *
 * @author      godruoyi <g@godruoyi.com>
 * @dateTime    2016-08-02 10:32:25
 * @version     
 * @since       1.0
 */
class SubjectImpl implements SubjectInterface
{
	
	/**
	 * 保存有观察者的引用数组
	 * 
	 * @var array
	 */
	private $observer = [];


	/**
	 * 该对象状态改变时通知观察者对象
	 * 
	 * @return
	 */
	public function notify()
	{
		if (!empty($this->observer)) {
			foreach ($this->observer as $ob) {
				$ob->update();
			}
		}
	}


	/**
	 * 注册观察者对象
	 * 
	 * @param Observer observer 观察者对象
	 */
	public function registerObserver(Observer $observer)
	{
		$this->observer[] = $observer;
	}


	/**
	 * 移除观察者对象
	 * 
	 * @param Observer observer 观察者对象
	 */
	public function removeObserver(Observer $observer)
	{
		$key = array_search($observer, $this->observer); 
		if(!($key === false)) { 
			unset($this->observer[$key]); 
		} 
	}


	/**
	 *  测试方法， 改变主题对象状态
	 * 
	 * @return [type] [description]
	 */
	public function change()
	{
		$this->notify();
	}
}