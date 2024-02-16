# 💻 My Automation Project 
This is a testing automation project that tests a real site called: www.automation.co.il

## 📖 Overview

This repository contains a comprehensive automated testing project built with Java, TestNG, and Allure Reports. 
The project follows the Page Object Model (POM) design pattern for a modular and maintainable test suite.

## Features

- **Java:** The project is developed using Java, providing a robust and widely used programming language for automation.
  
- **TestNG:** TestNG is used as the testing framework, offering powerful test configuration options, parallel execution, and detailed reporting.

- **Page Object Model (POM):** The project follows the POM design pattern, enhancing test maintainability and reusability by separating page elements and actions.

- **Allure Reports:** Test results are documented using Allure Reports, providing a clear and interactive visualization of test execution.

- **Logging:** The project includes logging capabilities to capture and document important events during test execution.

## Reports
<p>
  <img src="ScreenShots/tc02_addTask1615288676297.jpg" width="40%" title="Example for screenshot on failure">
  <img src="ScreenShots/tc01_addTask1614893191281.jpg" width="40%" alt="Example for screenshot on failure">
</p>

## 📖 Prerequisites

- Write here your Prerequisites if exists.

## 🚀 Getting Started

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/your-repo.git

## 📁 Project Structure
#!/bin/bash

#File: tree-md

tree=$(tree -tf --noreport -I '*~' --charset ascii $1 |
       sed -e 's/| \+/  /g' -e 's/[|`]-\+/ */g' -e 's:\(* \)\(\(.*/\)\([^/]\+\)\):\1[\4](\2):g')

printf "# Project tree\n\n${tree}"



