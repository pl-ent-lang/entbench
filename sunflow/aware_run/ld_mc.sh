#!/bin/bash

dir=`dirname "$0"`

ent -cp $dir/../build/classes:$dir/../janino.jar SunflowGUI -aa 0 1 -nogui $dir/large.sc
mv $dir/mode.txt $dir/run_ld_mc${1}.txt
