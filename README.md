As noted in the src file you will need to have Geckodriver installed (if testing in Firefox) or Chromedriver installed (if testing in Chrome). By default I've left the Chromedriver 'enabled' and the Firefox driver is commented out. 

VERY IMPORTANT: The filepath(s) must be updated in the code to access these drivers. By default the filepath is pointing to C:/Selenium/<drivername.exe>, so dropping the drivers in that directory should allow the script to run w/o needing to update the code. 

Gecko can be downloaded here: https://github.com/mozilla/geckodriver/releases
Chromedriver can be downloaded here: https://sites.google.com/a/chromium.org/chromedriver/downloads

Please note there are imcompatibilities with some of driver versions and browser versions, so if you're running older versions of Chrome or Firefox the latest Drivers may not be compatible. If that is the case previous versions are available.  

One last note: While it worked fine on my home machine, I had issues with Firefox displaying a certificate warning when executing this test on a different one - so I included code to adjust for that, but is currently commented out. 
