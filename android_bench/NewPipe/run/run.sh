#!/bin/bash

selection=(0 1 2 3 4)

levels=(vvh vh h m l)

for i in `seq 0 4`; do
  rm newpipe.stamp

  # Setup
  echo "ENT_BATTERY_LEVEL=0.90=float" > ent_properties.txt
  echo "NEWPIPE_VIDEO=${selection[$i]}=int" >> ent_properties.txt

  droid-connect.sh 
  
  droid-push.sh ent_properties.txt
  adb shell am force-stop org.schabi.newpipe
  adb shell am start -n org.schabi.newpipe/org.schabi.newpipe.VideoItemListActivity

  sleep 10

  tstart=`date "+%s"`

  ./monitor.sh &
  monitor=$!

  droid-replay.sh newpipe.sd >/dev/null & 
  child=$!

  wait $child

  kill -9 $monitor

  tend=`date "+%s"`

  echo "ERun 0: ${tstart} ${tend}" >> newpipe.stamp

  adb shell am force-stop org.schabi.newpipe

  mv newpipe.stamp ${levels[$i]}.stamp

  sleep 10

done




