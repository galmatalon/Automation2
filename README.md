# 💻 My Automation Project 
This is a testing automation demo project that tests a real site called: www.automation.co.il
- [x] This example is for the automation college students only (`המכללה לאוטומציה`)

![GitHub forks](https://img.shields.io/badge/Number%20Of%20Students-1000+-blue)

## 📖 Overview

This repository contains a comprehensive automated testing project built with Java, TestNG, and Allure Reports. 
The project follows the Page Object Model (POM) design pattern for a modular and maintainable test suite.

## 📑 Technologies & Skill & Features
| Technologies      | Description |
| ----------- | ----------- |
| **Java:**      | The project is developed using ==Java==, providing a robust and widely used programming language for automation.       |
| **TestNG:**   | ==TestNG== is used as the testing framework, offering powerful test configuration options, parallel execution, and detailed reporting.        |
| **Selenium WebDriver:**   | The project includes Selenium WebDriver for automating browser interactions        |
| **Page Object Model (POM):**   | The project follows the POM design pattern, enhancing test maintainability and reusability by separating page elements and actions.        |
| **Allure Reports:**   | Test results are documented using Allure Reports, providing a clear and interactive visualization of test execution.        |
| **Jenkins:**   | Continuous integration and continuous delivery (CI/CD) platform for automated builds and deployments.        |


## 📊 Reports
  ```cmd
  mvn allure:serve
  ```
## 📊 Reports Examples
<p>
  <img src="ScreenShots/tc02_addTask1615288676297.jpg" width="40%" title="Example for screenshot on failure">
  <img src="ScreenShots/tc01_addTask1614893191281.jpg" width="40%" alt="Example for screenshot on failure">
</p>
<style>
  * {
  margin: 0;
  padding: 0;
}
body {
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
}
.container {
  position: relative;
  width: 1160px;
  display: flex;
  justify-content: center;
  flex-wrap: wrap;
  transform-style: preserve-3d;
  perspective: 500px;
  margin: auto;
}
.container .box {
  position: relative;
  width: 275px;
  height: 275px;
  background: #000;
  transition: 0.5s;
  transform-style: preserve-3d;
  overflow: hidden;
  margin-right: 15px;
  margin-top: 45px;
}
.container:hover .box {
  transform: rotateY(25deg);
}
.container .box:hover ~ .box {
  transform: rotateY(-25deg);
}
.container .box:hover {
  transform: rotateY(0deg) scale(1.25);
  z-index: 1;
  box-shadow: 0 25px 40px rgba(0,0,0,0.5);
}
.container .box .imgBx {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
}
.container .box .imgBx:before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: linear-gradient(180deg,#f00,#000);
  z-index: 1;
  opacity: 0;
  transition: 0.5s;
  mix-blend-mode: multiply;
}
.container .box:hover .imgBx:before {
  opacity: 1;
}
.container .box .imgBx img {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  object-fit: cover;
}
.container .box .content {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1;
  display: flex;
  padding: 20px;
  align-items: flex-end;
  box-sizing: border-box;
}
.container .box .content h2 {
  color: #fff;
  transition: 0.5s;
  text-transform: uppercase;
  margin-bottom: 5px;
  font-size: 20px;
  transform: translateY(200px);
  transition-delay: 0.3s;
}
.container .box:hover .content h2 {
  transform: translateY(0px);
}
.container .box .content p {
  color: #fff;
  transition: 0.5s;
  font-size: 14px;
  transform: translateY(200px);
  transition-delay: 0.4s;
}
.container .box:hover .content p {
  transform: translateY(0px);
}
</style>
<p>
<div class="container">
  <div class="box">
    <div class="imgBx">
      <img src="https://images.unsplash.com/photo-1579748138140-ce9ef2c32db1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80">
    </div>
    <div class="content">
      <div>
        <h2>Image Title</h2>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi accusamus molestias quidem iusto.
        </p>
      </div>
    </div>
  </div>
  <div class="box">
    <div class="imgBx">
      <img src="https://images.unsplash.com/photo-1579639782539-15cc6c0be63f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80">
    </div>
    <div class="content">
      <div>
        <h2>Image Title</h2>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi accusamus molestias quidem iusto.
        </p>
      </div>
    </div>
  </div>
  <div class="box">
    <div class="imgBx">
      <img src="https://images.unsplash.com/photo-1603984362497-0a878f607b92?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=700&q=80">
    </div>
    <div class="content">
      <div>
        <h2>Image Title</h2>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi accusamus molestias quidem iusto.
        </p>
      </div>
    </div>
  </div>
  <div class="box">
    <div class="imgBx">
      <img src="https://images.unsplash.com/photo-1579310962131-aa21f240d986?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1234&q=80">
    </div>
    <div class="content">
      <div>
        <h2>Image Title</h2>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi accusamus molestias quidem iusto.
        </p>
      </div>
    </div>
  </div>
</div>

  
</p>

## 📖 Prerequisites

- Write here your Prerequisites if exists.

## 🚀 Getting Started

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/your-repo.git
    ```

## 📁 Project Structure
```
├───.settings
├───bin
│   ├───pages
│   └───tests
├───src
│   ├───pages
│   └───tests
└───test-output
    ├───Default suite
    ├───junitreports
    └───old
        └───Default suite
```

Thanks for visiting my GitHub profile! 😊




