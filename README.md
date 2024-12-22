# library-management-system

The Library Management System is a robust CLI application developed in Java, leveraging MySQL for database management. It facilitates comprehensive CRUD operations to efficiently manage book records. Users can effortlessly add, update, retrieve, and delete book information from the database.

The system also allows users to borrow and return books, ensuring seamless library transactions. This functionality simplifies the borrowing process, making it easy for users to access the resources they need.

Additionally, the application includes a feature to check the availability of books, providing real-time updates on the status of library resources. This ensures that users are always informed about the availability of books, promoting efficient resource utilization within the library.

Overall, this application streamlines library management processes, enhancing the overall user experience and promoting efficient resource utilization.
## Table of Contents
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Contributing](#contributing)
- [License](#license)
## Tech Stack
[![My Skills](https://skillicons.dev/icons?i=java,mysql,maven)](https://skillicons.dev)
## Prerequisites
1. **Ensure Maven is installed:**
   Verify Maven is installed and added to the `PATH`.
   - Run: `mvn -v`
   - If you see Maven's version details, it's correctly installed.

3. **Ensure JDK is installed:**
   Maven requires JDK. Verify with:
   - Run: `java -version`

5. **Navigate to the project directory:**
   Open Command Prompt and navigate to the directory containing your Maven project (`pom.xml` file).

## Installation
### How to Run a Maven Project in Popular IDEs
#### **1. IntelliJ IDEA**
1. **Import the Maven Project:**
   - Open IntelliJ IDEA.
   - Click on **File > Open**, and select the project folder containing the `pom.xml`.
   - IntelliJ will automatically detect the Maven project and import it.

2. **Build the Project:**
   - Open the **Maven tool window** (usually on the right-hand side).
   - Click on the **Reload All Maven Projects** button (🔄) to ensure dependencies are downloaded.
   - Build the project by clicking **Lifecycle > install** or **Lifecycle > package**.

3. **Run the Project:**
   - Locate the main class (`public static void main(String[] args)`).
   - Right-click the main class file and select **Run 'Main'**.


#### **2. Eclipse IDE**
1. **Import the Maven Project:**
   - Open Eclipse.
   - Go to **File > Import > Maven > Existing Maven Projects**.
   - Browse to the project folder and click **Finish**.

2. **Build the Project:**
   - Right-click the project in the **Project Explorer**.
   - Select **Run As > Maven install** or **Maven build** (then specify the goal, e.g., `clean install`).

3. **Run the Project:**
   - Locate the main class (`public static void main(String[] args)`).
   - Right-click the main class file and select **Run As > Java Application**.

#### **3. Visual Studio Code**
1. **Install Required Extensions:**
   - Install the **Maven for Java** and **Debugger for Java** extensions.

2. **Open the Project:**
   - Open VS Code.
   - Navigate to the folder containing the `pom.xml` file.

3. **Build the Project:**
   - Open the **Terminal** (`Ctrl + ~`), and run:
     ```bash
     mvn clean install
     ```

4. **Run the Project:**
   - Locate the main class in the **Explorer**.
   - Right-click the main class and select **Run Java**.

#### **4. NetBeans IDE**
1. **Open the Project:**
   - Open NetBeans.
   - Go to **File > Open Project**, and select the folder containing the `pom.xml`.

2. **Build the Project:**
   - Right-click the project in the **Projects** window.
   - Select **Build with Dependencies**.

3. **Run the Project:**
   - Right-click the main class file and select **Run File**.


Each IDE has specific Maven support, but these general steps should work.

### Steps to Install a Maven Project in CMD

1. **Navigate to the project directory:**
   ```bash
   cd path\to\your\project
   ```

2. **Run the Maven install command:**
   ```bash
   mvn install
   ```
   - This compiles the code, runs tests, and installs the built artifact (e.g., `.jar` or `.war` file) to your local Maven repository (`~/.m2/repository`).

3. **Optional Parameters:**
   - Skip Tests:
     ```bash
     mvn install -DskipTests
     ```
   - Clean and Install:
     ```bash
     mvn clean install
     ```
     The `clean` command removes previous builds before installing the new one.

4. **Verify Installation:**
   - Check the `target` directory in your project for the generated files (e.g., `.jar` or `.war`).
   - Verify the artifact is installed in your local Maven repository (`~/.m2/repository`).
## Contributing
1. Fork the repository.
2. Create a new branch: `git checkout -b feature-name`.
3. Make your changes.
4. Push your branch: `git push origin feature-name`.
5. Create a pull request.

## License
This project is licensed under the [MIT License](LICENSE).
