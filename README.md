# init-script-test

An example project that provides an example of how to use the leiningen-init-script plugin

## How-To
1. Clone the init-script-test repo

    git clone git://github.com/zkim/init-script-test.git

2. cd into the cloned repo directory
	
	<code>cd init-script-test</code>
	
3. Download dependencies
	
	<code>lein deps</code>
	
4. Run the init-script task
	
	<code>lein init-script
	
	Your output should look something like:
	
	Created /Users/zkim/tmp/init-script-test/init-script-test.jar
	Including init-script-test.jar
	Including clojure-1.1.0.jar
	Including clojure-contrib-1.1.0.jar
	Including leiningen-init-script-0.1.0.jar
	*** Done generating init scripts, see the /Users/zkim/tmp/init-script-test/init-script/ directory
	napple:init-script-test zkim$</code>
	
5. cd into the init-script directory
	<code>cd ./init-script</code>
	
6. Make install-init-script-test, clean-init-script-test runnable
	<code>chmod u+x ./install-init-script-test
	chmod u+x ./clean-init-script-test</code>
	
7. Install init script and jar
	<code>sudo ./install-init-script-test</code>
	
leiningen-init-script installs the jar to /usr/local/<project-name> and the init script to /etc/init.d. These defaults can be changed, see the Configuration section of the leiningen-init-script README

8. Start the daemon service
	<code>sudo /etc/init.d/init-script-testd start</code>
	
9. Verify the jar is running
	<code>ps -e
	
	Output:
	
	44678 ttys003    0:00.01 login -pf zkim
	44679 ttys003    0:00.11 -bash
	45216 ttys003    0:01.28 /usr/bin/java -jar /usr/local/init-script-test/init-script-test-standalone.jar
	45225 ttys003    0:00.00 ps -e</code>
	
10. Stop the daemon service and verify the process has stopped
	<code>sudo /etc/init.d/init-script-testd stop
	
	ps -e
	
	44198 ttys002    0:00.09 -bash
	44678 ttys003    0:00.01 login -pf zkim
	44679 ttys003    0:00.11 -bash
	45248 ttys003    0:00.00 ps -e</code>
	