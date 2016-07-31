<?php


// require './../../Behavior/Base/MonoyBehavior.php';

abstract class BaseClient
{
	protected $monoyBehavior = [];


	abstract public function getMonoySum();


	public function setMonoyBehavior(MonoyBehavior $monoyBehavior)
	{
		$this->monoyBehavior[] = $monoyBehavior;
	}
}