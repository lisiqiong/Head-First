<?php

require './Client/MonoySystem.php';
require './Behavior/Guizhou.php';
require './Behavior/Chongqing.php';

$monoySystem = new MonoySystem();
$monoySystem->setMonoyBehavior(new Guizhou());
$monoySystem->setMonoyBehavior(new Chongqing());

$summ = $monoySystem->getMonoySum();

echo '---------------------------' . "\r\n";
var_dump($summ);