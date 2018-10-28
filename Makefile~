CLASSPATH=$(shell pwd)/lib/antlr-4.7.1-complete.jar

.PHONY: all

all:
	rm -rf build
	mkdir build
	java -cp ${CLASSPATH} org.antlr.v4.Tool -o build Micro.g4
	rm -rf classes
	mkdir classes
	javac -source 1.7 -target 1.7 -cp ${CLASSPATH} -d classes src/*.java build/*.java

clean:
	rm -rf classes build
