all: HelloWorld.class

HelloWorld.class: HelloWorld.java
	javac HelloWorld.java

.PHONY: clean

clean:
	rm -f HelloWorld.class
