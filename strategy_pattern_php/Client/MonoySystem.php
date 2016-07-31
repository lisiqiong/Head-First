<?php

require 'Base/BaseClient.php';

class MonoySystem extends BaseClient
{

	public function getMonoySum()
	{
		$sum = 0;
		if (!empty($this->monoyBehavior)) {
			foreach ($this->monoyBehavior as $monoyBehavior) {
				$sum += $monoyBehavior->sum();
			}
		}
		return $sum;
	}
}