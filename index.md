# How to log in to a remote access ssh account
--- 

First, you must have visual studio code downloaded.  To do this you must first navigate to the online download page [VScode Download](https://code.visualstudio.com/Download), then download the installer. Then you must follow the installer wizards instructions and finish the installation process. Once visual studio code is properly installed it will look approximately like this :  
  
---
![Image](https://i.imgur.com/sxz2O8v.png)
  
---
  
Then you must remotely connect to the linux ieng server. To do this you need to properly have a git bash terminal installed [Git Download](https://git-scm.com/downloads) and operating on your visual studio code. To do this, you open the command palette in VScode, enter the default profile, and select the "Bash" terminal. Then you have to input your username and password for the remote client. If you do not have this, you may have to reset your password on the [UCSD account locator](https://sdacs.ucsd.edu/~icc/index.php), and finding your account name that appears like cs15lfa23(Two unique letters) [more help](https://docs.google.com/document/d/1hs7CyQeh-MdUfM9uv99i8tqfneos6Y8bDU0uhn1wqho/edit). If you end up properly logged in to the server it will look approximately like this:

---
![Image](https://i.imgur.com/jlO1yhT.png)
  
---
Finally, you must run some commands in the remote terminal like <code>cd</code>, <code>cat</code>, and different variations of <code>ls</code>, an example would be using <code>cd</code> to change your directory to the one where the file you want to manipulate is then using <code>cat</code> to output the contents of a text file in that directory. <code>ls</code> can be used to list all of the files in the working directory if you do not know what file to print. These commands run certain types of actions on the remote UCSD server you accesssed. This way you can navigate the file structure of this computer from the terminal in visual studio. After you run some commands this will look approximately like this with different commands:  
  
---
![Image](https://i.imgur.com/twR1EUI.png)

---
You are done, you have logged into a remote account and submitted commands to the server, congrats!
