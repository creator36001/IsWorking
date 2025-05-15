rm -r out/
mkdir -p out/org/fairviewhs/isWorking
cd out
javac ../org/fairviewhs/isWorking/*.java -d .
jar cvfe program.jar org.fairviewhs.isWorking.Main org/fairviewhs/isWorking/*.class