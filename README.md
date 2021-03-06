# SafeBAC
Play Framework server for alcohol consumption management app.

##Workflow
1. Create new branch
2. Commit changes often to your branch
3. Submit a pull request when all your changes are ready to be merged
4. Someone else should review and accept the pull request
5. 

## Git Commands ##
Clone Repo
```
git clone <GitHub url>
```

Checkout New Branch
```
Create new branch on GitHub.
git checkout -b dev                                                     // Creates new branch locally
git branch --set-upstream-to=origin/<branch_name> <branch_name>         //links local branch to remote branch
```

Pull Remote Changes
```
git pull
```

Add New File to Branch Locally
```
git add <file_name>
```

Add All New Files to Branch Locally
```
git add -A
```

Commit Changes Locally
```
git commit -m "commit message"
```

Push Changes to Remote Branch
```
git push
```

##Installation
1. Install Git
2. Install MYSQL server and MYSQWorkbench
3. Install IntelliJ
4. Add SBT plugin to IntelliJ
5. In terminal: git clone <git url>
6. Open Intellij
  - import project from existing model
  - sbt
  - select the folder where the project is cloned

##Sample Instance
http://ec2-52-34-240-224.us-west-2.compute.amazonaws.com:9000
