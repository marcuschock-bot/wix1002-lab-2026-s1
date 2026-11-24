# Tutorial 05 — Answers

### Question 1a
```java
double[] numbers = new double[12];
```

### Question 1b
```java
char[] letters = {'A', 'B', 'C', 'D', 'E'};
```

### Question 1c
```java
String[] studentNames = new String[100];
```

### Question 1d
```java
int[][] table = new int[6][2];
```

### Question 1e
```java
int[][] matrix = {
    {6, 9},
    {2, 5},
    {4, 6}
};
```

### Question 1f
```java
matrix[1][1] = 4;
matrix[2][0] = 3;
matrix[2][1] = 7;
```

### Question 1g
```java
for (int i = 0; i < contact.length; i++) {
    System.out.println(contact[i]);
}
```

### Question 2a
```java
// Error: Single quotes (' ') are for char, String requires double quotes (" ")
String[] code = {"AAA", "AAB", "AAC", "AAD"};
```

### Question 2b
```java
// Error 1: Should instantiate 'new int[10]', not 'new num[10]'
// Error 2: Array length is a property 'num.length' (no parentheses)
// Error 3: Loop condition 'k <= num.length' causes ArrayIndexOutOfBoundsException; use 'k < num.length'
// Error 4: Must add the element 'num[k]' to sum, not the array reference 'num'
int[] num = new int[10];
int sum = 0;
for (int k = 0; k < num.length; k++) {
    sum += num[k];
}
```

### Question 2c
```java
// Error: Second dimension (columns) was not initialized before assigning a value
int[][] t = new int[3][3];
t[1][2] = 5;
```

### Question 2d
```java
// Error: '++i' increments i to 5, which is out of bounds for an array of size 5 (valid indices: 0 to 4)
int i = 4;
int[] score = new int[5];
score[1] = 78;
score[i] = 100;
```

### Question 3
```java
// Step-by-step trace:
// i = 0, j = 1
// marks[0] = 12                        -> {12, 0, 0, 0, 0}
// marks[1] = 12 + 19 = 31              -> {12, 31, 0, 0, 0}
// marks[0] = 31 * 31 = 961             -> {961, 31, 0, 0, 0}
// marks[3] = marks[1] = 31             -> {961, 31, 0, 31, 0}
// ++j makes j = 2; marks[2] = 961 % 5 = 1 -> {961, 31, 1, 31, 0}
// marks[4] = marks[1] = 31             -> {961, 31, 1, 31, 31}

// Final values of each element:
// marks[0] = 961
// marks[1] = 31
// marks[2] = 1
// marks[3] = 31
// marks[4] = 31
```

### Question 4
```java
int count = 0;
for (int i = 0; i < sentence.length; i++) {
    String[] words = sentence[i].split(" ");
    for (int j = 0; j < words.length; j++) {
        if (words[j].equals("the")) {
            count++;
        }
    }
}
System.out.println("Number of occurrences of \"the\": " + count);
```

### Question 5
```java
for (int i = sentence.length - 1; i >= 0; i--) {
    for (int j = sentence[i].length() - 1; j >= 0; j--) {
        System.out.print(sentence[i].charAt(j));
    }
    System.out.println();
}
```

### Question 6
```java
java.util.Random rand = new java.util.Random();
int num = rand.nextInt(256); // Generates random integer from 0 to 255
int[] binary = new int[8];

int temp = num;
for (int i = 7; i >= 0; i--) {
    binary[i] = temp % 2;
    temp /= 2;
}

System.out.print("Decimal: " + num + " -> Binary: ");
for (int i = 0; i < binary.length; i++) {
    System.out.print(binary[i]);
}
System.out.println();
```