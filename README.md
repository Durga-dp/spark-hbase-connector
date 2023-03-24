# spark-hbase-connector
connector that connects spark and hbase; use Spark to read or write into hbase.

This framework sometimes make a full hbase table scan which is not effienent in all cases.
I recommend using Java API if you know list of row_keys you want to work with.

This code is from https://github.com/nerdammer/spark-hbase-connector which is scala 2.11 compataible.
I made some changes to repo to make it scala 2.12 compataible

run > sbt package

Happy! coding