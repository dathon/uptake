As noted in the file you will need to have Geckodriver install (if testing in Firefox) or Chromedriver installed for testing in Chrome. 

VERY IMPORTANT: The filepath(s) must be updated in the code to access these drivers.

By default the filepath is pointing to C:/Selenium/<drivername.exe>

Gecko can be downloaded here: https://github.com/mozilla/geckodriver/releases
Chromedriver can be downloaded here: https://sites.google.com/a/chromium.org/chromedriver/downloads

Current Chromedriver is "enabled" in the code and Firefox driver is commented out. 

While it worked fine on my home machine, I had issues with Firefox displaying a certificate warning when executing this test on a different one - I included code to adjust for that, but is currently commented out. 
