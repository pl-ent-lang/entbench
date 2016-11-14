# entbench

Instructions
------------
You will need to install [Ent](https://github.com/anthonycanino1/ent) to run the benchmarks. 

Most benchmarks are split in to two directories --- adapt and baware --- that contain the code for Battery-Casing and Battery-Exception benchmarks. Benchmarks that have a Temperature-Casing run will contain a tadapt directory. There are scripts to automatically set up a specific benchmark, typically named switch_to_adapt.sh, switch_to_aware.sh, and switch_to_tadapt.sh.

In addition, there are run directories that contain scripts --- all.sh, ld.sh, md.sh, sd.sh --- that kick up the actual benchmark once compiled. These directories are labeled adapt_run, bware_run, and tadapt_run.

For example, the Battery-Casing source code and run directory for sunflow is located at sunflow/adapt and sunflow/adapt_run. 

You will have to manually adjust the ant build.xml files to point to your copy of Ent before building. [Pi specific benchmarks are located in a seperate repository](https://github.com/pl-ent-lang/entbench-pi) but follow a similar structure. Android benchmarks are located in the /android_bench subdirectory. There are also some useful scripts for working with the android platform contained in /android_bench/android-scripts. We also use [RERAN](https://github.com/lorenzogomez/RERAN) for running android benchmarks.

Additional Notes
----------------
The top level directory contains all scripts used to collect, analyze, and plot data. Scripts are named similarly to the associated benchmarks. For example, badapt.rb will gather up the results (left in the run dirctories of each benchmark) for the Battery-Casing runs. badapt.R will plot the results. The stamp scripts will convert a log recorded from the Wattsup power meter and a set of run timestamps into energy results that may be analyzed.

