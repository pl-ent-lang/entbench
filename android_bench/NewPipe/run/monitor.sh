#!/bin/bash

i=0

while true; do
  tstart=`date "+%s"`

  sleep 20

  tend=`date "+%s"`

  echo "ETask ${i}: ${tstart} ${tend}" >> newpipe.stamp

  i=$((i+1))
done
