# Java Thread Scheduling Assignment

## Overview

This project demonstrates basic thread scheduling concepts in Java through three separate programs:

1. **BasicConcurrentVersion.java**  
   Two threads run concurrently — one prints numbers from 1 to 100, and the other prints letters from 'a' to 'z' followed by 'A' to 'Z'.

2. **JoinVersion.java**  
   The second thread (letters) waits for the first thread (numbers) to finish execution before starting, using the `Thread.join()` method.

3. **SleepVersion.java**  
   Both threads run concurrently, but after printing each number or letter, the thread sleeps for 1 second using `Thread.sleep(1000)` to simulate delay and observe scheduling behavior more clearly.

---

## Files

| File Name              | Description                                                       |
|------------------------|-------------------------------------------------------------------|
| `BasicConcurrentVersion.java` | Starts both threads simultaneously without waiting.             |
| `JoinVersion.java`            | Second thread starts only after the first one finishes.         |
| `SleepVersion.java`           | Each thread sleeps for 1 second after each print.               |
| `README.md`                   | Project explanation and usage instructions.                    |

---

## How to Run

You can compile and run each Java file independently using any Java IDE or the terminal:

### Compile

```bash
javac BasicConcurrentVersion.java
javac JoinVersion.java
javac SleepVersion.java
````

### Run

```bash
java BasicConcurrentVersion
java JoinVersion
java SleepVersion
```

---

## Concepts Demonstrated

* **Thread Creation**: Using `Runnable` and `Thread` classes.
* **Concurrent Execution**: Running multiple threads at the same time.
* **Thread Coordination**: Using `Thread.join()` to control execution order.
* **Thread Sleeping**: Using `Thread.sleep()` to introduce delay and visualize thread switching.

---

## Author

* 👨‍💻 Developed by: **Salah ElDin Saeed Abu Saif 120190964**
* 🎓 **Software Engineering** at **Palestine University**, majoring in **Software Engineering**
* 📘 Course: **Concurrent and Real-Time Programming**
* 🧑‍🏫 Supervisor: **Dr. Jamil Alagha**

---

## License

This project is intended for educational purposes. You are free to use and modify it.
