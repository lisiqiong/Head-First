<?php

/**
 * 主题对象， 该对象状态可能会发生改变， 改变时通知其已观察对象
 *
 * @author      godruoyi <g@godruoyi.com>
 * @dateTime    2016-08-02 10:29:40
 * @version     
 * @since       1.0
 */
interface SubjectInterface
{
	
	public function notify();


	public function registerObserver(Observer $observer);


	public function removeObserver(Observer $observer);
}