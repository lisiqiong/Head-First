<?php

require './Observer/Observer.php';
require './Observer/ObserverImplOne.php';
require './Observer/ObserverImplTwo.php';
require './Subject/SubjectInterface.php';
require './Subject/SubjectImpl.php';


//实例化主题类
$subject = new SubjectImpl();


//--------------------注册/移除 观察者--------------------------

// new ObserverImplOne($subject);//构造器注入观察者
$observerImplOne = new ObserverImplOne();
$observerImplOne->registerObserver($subject);

//注册第二个观察者
new ObserverImplTwo($subject);

//移除第一个观察者
$subject->removeObserver($observerImplOne);

//--------------------注册/移除 观察者--------------------------


//主题对象发生改变
$subject->change();