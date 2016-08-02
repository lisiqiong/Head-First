<?php

/**
 * 观察者对象实现， 任何想接受主题对象通知的对象， 都可以注册成为观察者对象， 
 * 需实现Observe接口
 *
 * @author      godruoyi <g@godruoyi.com>
 * @dateTime    2016-08-02 10:53:55
 * @version     
 * @since       1.0
 */
class ObserverImplOne implements Observer
{

	/**
	 * 观察者对象中持有主题对象的引用， 方便注册和移除 
	 * 
	 * @var null
	 */
	private $subjectInterface = NULL;


	/**
	 * 观察者对象实例化时， 需要主题对象的支持， 因为对象想注册成为观察者， 必须要有主题对象才有权将某对象注册为观察者或移除
	 * 
	 * @param SubjectInterface $subjectInterface [description]
	 */
	// public function __construct(SubjectInterface $subjectInterface)
	// {
	// 	$this->subjectInterface = $subjectInterface;

	// 	//向主题对象注册成观察者
	// 	$this->subjectInterface->registerObserver($this);
	// }


	/**
	 * 当然， 也可以选择其他方法来注册成为观察者， 不一定要在构造器里
	 * 但是都需要主题对象的引用， 
	 *
	 * @param SubjectInterface $subjectInterface [description]
	 * @return [type] [description]
	 */
	public function registerObserver(SubjectInterface $subjectInterface)
	{
		$this->subjectInterface = $subjectInterface;

		//向主题对象注册成观察者
		$this->subjectInterface->registerObserver($this);
	}


	/**
	 * 当主题对象改变时, 通知观察者
	 * 
	 * @return
	 */
	public function update()
	{
		echo '当主题对象改变时，劳资ObserverImplOne是被改变了.....' . "\r\n";
	}
}