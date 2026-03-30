<div align="center">

# 📏 Quantity Measurement App

### *Precision in Every Measurement, Flexibility in Every Unit*

![Status](https://img.shields.io/badge/Status-In%20Development-blue?style=for-the-badge)
![Type](https://img.shields.io/badge/Type-Personal%20Project-purple?style=for-the-badge)
![Progress](https://img.shields.io/badge/Progress-Daily%20Updates-orange?style=for-the-badge)
![Version](https://img.shields.io/badge/Version-0.18.0-green?style=for-the-badge)

</div>
---

## 🎯 Overview

The **Quantity Measurement App** is an intelligent application designed to compare quantities across different units of measurement. Whether you're working with **length**, **weight**, **volume**, or **temperature**—this app handles it all with precision and ease.

> 💡 **Smart Conversions** • **Accurate Comparisons** • **Quantity Arithmetic**

<br>

## ✨ Features

<table>
<tr>
<td width="25%" valign="top">

### 🔄 Comparison
Compare two quantities of the same type using different units with precision

</td>
<td width="25%" valign="top">

### 🔁 Conversion
Convert values from one unit to another within the same measurement type

</td>
<td width="25%" valign="top">

### ➕ Arithmetic
Perform operations on quantities with automatic unit handling

</td>
<td width="25%" valign="top">

### 🔐 Authentication
Secure JWT-based authentication with Google OAuth2 integration

</td>
</tr>
</table>

<br>

## 📊 Supported Measurement Types

<div align="center">

| 📐 Measurement | 🏷️ Example Units |
|:---:|:---|
| **📏 Length** | Meters • Feet • Inches • Centimeters • Kilometers • Miles |
| **⚖️ Weight** | Kilograms • Pounds • Grams • Ounces • Tons |
| **🧪 Volume** | Liters • Gallons • Milliliters • Cubic Meters |
| **🌡️ Temperature** | Celsius • Fahrenheit • Kelvin |

</div>

<br>

## � Development Progress

<div align="center">

> 🔄 **This is a personal project with daily incremental updates**  
> Progress will be tracked here as development continues

</div>

### 📝 Latest Updates

<table>
<tr style="background-color: #f8f9fa;">
<td width="20%" align="center" style="background-color: #f8f9fa;"><b>📆 Date</b></td>
<td width="80%" style="background-color: #f8f9fa;"><b>✨ Updates</b></td>
</tr>
<tr style="background-color: #e3f2fd;">
<td align="center" style="background-color: #e3f2fd;">🚀 <b>Day 1</b><br><sub>Feb 19, 2026</sub></td>
<td style="background-color: #e3f2fd;">

- ✅ Project initialization
- ✅ README setup with project structure
- 📝 Defined core features and measurement types

</td>
</tr>
<tr style="background-color: #fff3e0;">
<td align="center" style="background-color: #fff3e0;">⏳ <b>Day 2</b><br><sub>20 Feb 2026</sub></td>
<td style="background-color: #fff3e0;">

- 📌 Added Quantity measurement class with Feet inner class that contains the comparison logic. <br>
  [QuantityMeasurementlass](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC1-FeetEquality/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added QuantityMeasurementAppTest class with test cases for Feet equality. <br>
  [QuantityMeasurementAppTest](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC1-FeetEquality/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)

</td>
</tr>

<tr style="background-color: #e3f2fd;">
<td align="center" style="background-color: #e3f2fd;">⏳ <b>Day 3</b><br><sub>21 Feb 2026</sub></td>
<td style="background-color: #e3f2fd;">

- 📌 Added User Case 3 with feature to have a generic class for length and centralised comparison logic. <br>
  [Generic Class](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC3-GenericLength/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added updated QuantityMeasurementAppTest class with test cases for Feet equality. <br>
  [QuantityMeasurementAppTest](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC3-GenericLength/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)

</td>
</tr>

<tr style="background-color: #fff3e0;">
<td align="center" style="background-color: #fff3e0;">⏳ <b>Day 4</b><br><sub>22 Feb 2026</sub></td>
<td style="background-color: #fff3e0;">

- 📌 Added User Case 4 with feature to have a YARDS and CENTIMETERS conversions logic. <br>
  [Generic Class](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC4-YardEquality/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added updated QuantityMeasurementAppTest class with test all available units for equallity and changeability. <br>
  [QuantityMeasurementAppTest](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC4-YardEquality/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
-  Added UC5 with feature to convert units between the two types <br>
  [Length and QuantityManagement class](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC5-UnitConversion/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)

- Added updated QuantityMeasurementAppTest class with test cases for unit conversion. <br>
  [QuantityMeasurementAppTest](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC5-UnitConversion/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)

</td>
</tr>

<tr style="background-color: #e3f2fd;">
<td align="center" style="background-color: #e3f2fd;">⏳ <b>Day 5</b><br><sub>23 Feb 2026</sub></td>
<td style="background-color: #e3f2fd;">

- 📌 Added User Case 6 with feature to have a generic class for length and centralised addition logic. <br>
  [Length Class with QuantityMeasurementApp class](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC6-UnitAddition/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added updated QuantityMeasurementAppTest class with test cases for unit addition. <br>
  [QuantityMeasurementAppTest](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC6-UnitAddition/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)

<hr>

  - 📌 Added User Case 7 with feature to have a generic class for length and separate concern for centralised method and . <br>
  [Length Class with QuantityMeasurementApp class](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC7-TargetUnitAddition/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added updated QuantityMeasurementAppTest class with test cases for unit addition. <br>
  [UC7-TEST CASES](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC7-TargetUnitAddition/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)

   <hr>

- 📌 Added User Case 8 with feature to have a separate Enum unit lass class for length and separate concern for centralised methods. <br>
  [Length Class, Length Unit Enum with QuantityMeasurementApp class](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC8-StandaloneUnit/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added updated Test class with test cases for UC8. <br>
  [UC8-TEST CASES](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC8-StandaloneUnit/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)

  <hr>

  - 📌 Added User Case 9 with feature to have a separate Enum unit class for weight and separate concern for centralised methods. <br>
  [Weight Class, Weight Unit Enum with QuantityMeasurementApp class](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC9-WeightMeasurement/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added updated Test class with test cases for UC9. <br>
  [UC9-TEST CASES](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC9-WeightMeasurement/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)

   <hr>

  - 📌 Added User Case 10 with feature to have a interface for contract to enums and also the Quantity Generic class and generic methods. <br>
  [IMeasurable Interface and ENUMS](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC10-GenrricQuantity/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added updated Test class with test cases for UC10. <br>
  [UC10-TEST CASES](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC10-Interface/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
</td>
</tr>
<tr style="background-color: #fff3e0;">
<td align="center" style="background-color: #fff3e0;">⏳ <b>Day 6</b><br><sub>24 Feb 2026</sub></td>
<td style="background-color: #fff3e0;">

- 📌 Added User Case 11 with feature to have a VOLUME Enum. <br>
  [GENERIC INTERFACE-VOLUME ENUM-QUANTITY CLASS](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC11-VolumeMeasurement/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added updated QuantityMeasurementAppTest class with test cases for Volume EQUALITY, ADDITION and CONVERSION. <br>
  [QuantityMeasurementAppTest](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC11-VolumeMeasurement/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)


<hr>


- 📌 Added User Case 12 with feature to have a Subtract and divide feature. <br>
  [Subtract-Divide](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC12-SubtractDivide/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added updated QuantityMeasurementAppTest class with test cases for Volume SUBTRACT and DIVIDE. <br>
  [QuantityMeasurementAppTest](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC12-SubtractDivide/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)


<hr>


- 📌 Added User Case 13 with feature to have a seperate Enum ffor arithematic operation and refactored validation methods. <br>
  [VALIDATION-AND-ENUM](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC12-CentralisedArithematic/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added updated QuantityMeasurementAppTest class with test cases for updated code changes. <br>
  [QuantityMeasurementAppTest](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC12-CentralisedArithematic/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)

</td>
</tr>
<tr style="background-color: #e3f2fd;">
<td align="center" style="background-color: #e3f2fd;">⏳ <b>Day 7</b><br><sub>27 Feb 2026</sub></td>
<td style="background-color: #e3f2fd;">

- 📌 Added User Case 14 with feature to support Temperature measurement, implementing selective arithmetic constraints via Functional Interfaces and Lambda expressions. <br>
  [TemperatureUnit & Refactored Engine](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC14-TemperatureUnit/src/main/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)
  <br>
- Added updated QuantityMeasurementAppTest class with test cases for temperature equality, non-linear conversions, and UnsupportedOperation validation. <br>
  [QuantityMeasurementAppTest](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC14-TemperatureUnit/src/test/java/com/app/quantitymeasurementapp/QuantityMeasurementApp)

</td>
</tr>

<tr style="background-color: #fff3e0;">
<td align="center" style="background-color: #fff3e0;">⏳ <b>Day 8</b><br><sub>13 March 2026</sub></td>
<td style="background-color: #fff3e0;">

- 📌 Added Quantity measurement class with Feet inner class that contains the comparison logic. <br>
  [QuantityMeasurementApp](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC15-NTierArchitectureRefactoring/src/main/java/com/app/quantitymeasurementapp)
  <br>
- Added QuantityMeasurementAppTest class with test cases for Feet equality. <br>
  [QuantityMeasurementAppTest](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC15-NTierArchitectureRefactoring/src/test/java/com/app/quantitymeasurementapp)

</td>
</tr>

<tr style="background-color: #e3f2fd;">
<td align="center" style="background-color: #e3f2fd;">⏳ <b>Day 9</b><br><sub>16 March 2026</sub></td>
<td style="background-color: #e3f2fd;">

- 📌 Added UC16 with full Database Integration using JDBC — complete N-Tier architecture with controller, service, repository, entity, exception, unit, and util packages. <br>
  [Full Source — UC16](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC16-DatabaseIntegrationWithJDBC/src/main/java/com/app/quantitymeasurementapp)

<hr>

- 📌 Added custom `ConnectionPool.java` for managing a reusable fleet of JDBC connections with borrow, release, validate, and shutdown lifecycle. <br>
- 📌 Added `ApplicationConfig.java` singleton configuration loader reading H2 database URL, credentials, pool size, and logging settings from `application.properties`. <br>
  [Util Layer](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC16-DatabaseIntegrationWithJDBC/src/main/java/com/app/quantitymeasurementapp/util)

<hr>

- 📌 Added `IQuantityMeasurementRepository.java` interface, `QuantityMeasurementDatabaseRepository.java` (full JDBC CRUD implementation), and `QuantityMeasurementCacheRepository.java` (in-memory store for dev/testing). <br>
  [Repository Layer](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC16-DatabaseIntegrationWithJDBC/src/main/java/com/app/quantitymeasurementapp/repository)

<hr>

- 📌 Added `IQuantityMeasurementService.java` and `QuantityMeasurementServiceImpl.java` orchestrating conversions, arithmetic, and result persistence via repository. <br>
  [Service Layer](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC16-DatabaseIntegrationWithJDBC/src/main/java/com/app/quantitymeasurementapp/service)

<hr>

- 📌 Added `application.properties` for H2 database connection & pool config, and `schema.db` as the H2 database file with initial audit log schema. <br>
  [Resources](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC16-DatabaseIntegrationWithJDBC/src/main/resources)
- Added updated `QuantityMeasurementAppTest` class. <br>
  [QuantityMeasurementAppTest](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC16-DatabaseIntegrationWithJDBC/src/test/java/com/app/quantitymeasurementapp)

</td>
</tr>

<tr style="background-color: #f0f0f0;">
<td colspan="2" align="center" style="padding: 20px; border-top: 3px solid #333; border-bottom: 3px solid #333;"><b>━━━━━━━━━━━━━━━━━</b></td>
</tr>

<tr style="background-color: #fff3e0;">
<td align="center" style="background-color: #fff3e0;">🚀 <b>Day 10</b><br><sub>19 March 2026</sub></td>
<td style="background-color: #fff3e0;">

- 📌 Added UC17 with Spring Framework Integration — migrated from JDBC to Spring Boot with complete Spring ecosystem integration. <br>
  [Full Source — UC17](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC17-SpringFrameworkIntegration/src/main/java/com/app/quantitymeasurementapp)

<hr>

- 📌 Added Spring Boot application configuration with `Application.java` and `QuantityMeasurementApplication.java` as entry points. <br>
  [Application Layer](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC17-SpringFrameworkIntegration/src/main/java/com/app/quantitymeasurementapp)

<hr>

- 📌 Added `QuantityMeasurementController.java` providing REST API endpoints for quantity comparisons, conversions, and arithmetic operations. <br>
  [Controller Layer](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC17-SpringFrameworkIntegration/src/main/java/com/app/quantitymeasurementapp/controller)

<hr>

- 📌 Refactored service layer with `IQuantityMeasurementService.java` interface and `QuantityMeasurementServiceImpl.java` using Spring dependency injection. <br>
  [Service Layer](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC17-SpringFrameworkIntegration/src/main/java/com/app/quantitymeasurementapp/service)

<hr>

- 📌 Implemented Spring Data JPA with `QuantityMeasurementRepository.java` for seamless database operations. <br>
- 📌 Added `QuantityMeasurementEntity.java` with JPA annotations for ORM mapping. <br>
  [Repository & Entity Layer](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC17-SpringFrameworkIntegration/src/main/java/com/app/quantitymeasurementapp/repository)

<hr>

- 📌 Enhanced exception handling with `GlobalExceptionHandler.java` and `QuantityMeasurementException.java` for REST error responses. <br>
  [Exception Layer](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC17-SpringFrameworkIntegration/src/main/java/com/app/quantitymeasurementapp/exception)

<hr>

- 📌 Added `SecurityConfig.java` with Spring Security configuration for API protection and authentication. <br>
  [Config Layer](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC17-SpringFrameworkIntegration/src/main/java/com/app/quantitymeasurementapp/config)

<hr>

- 📌 Created comprehensive unit model with multiple enums (LengthUnit, WeightUnit, VolumeUnit, TemperatureUnit) and interfaces (IMeasurable, SupportsArithmetic). <br>
  [Unit Layer](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC17-SpringFrameworkIntegration/src/main/java/com/app/quantitymeasurementapp/unit)

<hr>

- 📌 Added Maven configuration (`pom.xml`) with Spring Boot, Spring Data JPA, Spring Security, and JUnit dependencies. <br>
- 📌 Added Maven wrapper scripts (`mvnw`, `mvnw.cmd`) for cross-platform build support. <br>
  [Build Configuration](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC17-SpringFrameworkIntegration)

<hr>

- 📌 Created comprehensive test suite with `ApplicationTests.java` and `QuantityMeasurementServiceImplTest.java` validating service functionality. <br>
  [Test Layer](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC17-SpringFrameworkIntegration/src/test/java/com/app/quantitymeasurementapp)

</td>
</tr>

<tr style="background-color: #e3f2fd;">
<td align="center" style="background-color: #e3f2fd;">🔐 <b>Day 11</b><br><sub>30 March 2026</sub></td>
<td style="background-color: #e3f2fd;">

- 📌 Added UC18 with JWT Authentication and Google OAuth2 Integration — comprehensive security layer with token-based authentication. <br>
  [Full Source — UC18](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC18-JWTandGoogleAunthentication/src/main/java/com/app/quantitymeasurementapp/auth)

<hr>

- 📌 Added complete authentication module with `AuthController.java` providing REST endpoints for login, registration, token refresh, and OAuth2 callback handling. <br>
  [Auth Controller](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/blob/feature/UC18-JWTandGoogleAunthentication/src/main/java/com/app/quantitymeasurementapp/auth/controller/AuthController.java)

<hr>

- 📌 Created comprehensive DTO layer with `AuthResponse`, `LoginRequest`, `RegisterRequest`, and `RefreshTokenRequest` for secure data transfer. <br>
  [Auth DTOs](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC18-JWTandGoogleAunthentication/src/main/java/com/app/quantitymeasurementapp/auth/dto)

<hr>

- 📌 Implemented JWT security with `JwtService.java` for token generation/validation, `JwtAuthenticationFilter.java` for request filtering, and `RefreshTokenService.java` for token refresh management. <br>
  [JWT Services](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC18-JWTandGoogleAunthentication/src/main/java/com/app/quantitymeasurementapp/auth/service)

<hr>

- 📌 Added Google OAuth2 integration with `CustomOAuth2UserService.java`, `OAuth2LoginSuccessHandler.java`, and `OAuth2LoginFailureHandler.java` for seamless social authentication. <br>
  [OAuth2 Handlers & Services](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC18-JWTandGoogleAunthentication/src/main/java/com/app/quantitymeasurementapp/auth/handler)

<hr>

- 📌 Enhanced entity layer with `User.java` supporting both local and OAuth2 providers, `RefreshToken.java` for token management, and `AuthProvider.java` enum for provider types. <br>
  [Auth Entities](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC18-JWTandGoogleAunthentication/src/main/java/com/app/quantitymeasurementapp/auth/entity)

<hr>

- 📌 Updated Spring Security configuration with JWT and OAuth2 integration, API documentation with OpenAPI security schemes, and comprehensive exception handling for authentication flows. <br>
  [Security Config](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/blob/feature/UC18-JWTandGoogleAunthentication/src/main/java/com/app/quantitymeasurementapp/config/SecurityConfig.java) | [OpenAPI Config](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/blob/feature/UC18-JWTandGoogleAunthentication/src/main/java/com/app/quantitymeasurementapp/config/OpenApiConfig.java)

<hr>

- 📌 Implemented complete repository layer with `UserRepository.java` and `RefreshTokenRepository.java` for secure user and token data persistence. <br>
  [Auth Repositories](https://github.com/Abhishek-Pandey-git/QuantityMeasurementApp/tree/feature/UC18-JWTandGoogleAunthentication/src/main/java/com/app/quantitymeasurementapp/auth/repository)

</td>
</tr>

</table>

<br>

## 🎯 Project Goals

<div align="center">

```diff
+ Build a robust quantity measurement system with precise calculations
+ Demonstrate incremental software development methodology
+ Maintain clean architecture and code quality throughout iterations
+ Create a user-friendly interface for quantity operations
+ Ensure extensibility for adding new unit types and measurement categories
```

</div>

<br>

---




<br>

## 👤 About

<div align="center">

**Personal Project** • *Learning & Building*

*This is an individual learning project focused on building a full-stack quantity measurement application with incremental improvements.*

</div>

<br>

---

<div align="center">

### 💫 Built with Precision, Designed for Flexibility

**Made with PRECISION for accurate measurements**

<br>

![Footer](https://capsule-render.vercel.app/api?type=waving&color=gradient&height=100&section=footer)

</div>

