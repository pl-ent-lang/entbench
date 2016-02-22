#!/bin/sh

dir=`dirname "$0"`

export PANDA_BATTERY_RUN=true

export PANDA_RUNS=50

ent -cp $dir/../classes:$dir/../lib/xalan-2.6.0.jar:$dir/../lib/xerces_2_5_0.jar:$dir/../lib/xml-apis-ext.jar:$dir/../lib/xml-apis.jar:$dir/../resources org.apache.batik.apps.rasterizer.Main -m image/jpeg -w 4096 $dir/medium.svg 

mv $dir/mode.txt $dir/run_md_${1}.txt
