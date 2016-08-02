<?php

/**
 * 观察者接口， 所有的观察者对象都要实现该接口
 *
 * @author      godruoyi <g@godruoyi.com>
 * @dateTime    2016-08-02 10:27:20
 * @version     
 * @since       1.0
 */
interface Observer
{

	/**
	 * 当主题对象改变时， 通知观察者对象
	 * 
	 * @return void
	 */
	public function update();
}