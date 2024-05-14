all:
	javac *.java

clean:
	del /F /Q *.class && cd ./AST_Generator && del /F /Q *.class && cd ../Evaluator && del /F /Q *.class && cd ../Lambda && del /F /Q *.class && cd ../Scanner && del /F /Q *.class && cd ../Parser && del /F /Q *.class && cd ../Utils && del /F /Q *.class	
