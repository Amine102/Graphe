# =================================================================
# File: Makefile

JFLAGS 	= -g
JC 		= javac
JVM		= java 
CLASSFILE= classes/to
.SUFFIXES: .java .class

.java.class:
		$(JC) $(JFLAGS) $*.java

$(OUT)/%.class : %.java
		mkdir -p $(@D)
		$(JC) -o $@ $<

$(OUT_DIR):
	mkdir -p $(OUT_DIR)

CLASSES = \
 		Graph.java \
		Node.java \
		Arc.java \
		Main.java 

MAIN = Main 

default: classes

classes: $(CLASSES:.java=.class)

run: 
	$(MAIN).class
	$(JVM) $(MAIN)

clean:
		$(RM) *.class