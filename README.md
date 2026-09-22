CS 3354 Assignment 1 – Grocery Management System

Project Overview

This project is a Java grocery management system created for CS 3354

The program uses parallel arrays to store grocery item information:

* String[] itemNames
* double[] itemPrices
* int[] itemStocks

The same index in each array represents the same grocery item.

For example:
itemNames[0] = "Apples";
itemPrices[0] = 2.99;
itemStocks[0] = 15;

The program will allow the user to:

1. View the current inventory
2. Restock an existing item
3. Exit the program

---

Team Members and Responsibilities

| Team Member         | Branch            | Responsibility                                                                      |
| -----------         | ----------------- | ----------------------------------------------------------------------------------- |
| LaPree Habbit       | `feature-display` | Create the `printInventory()` method                                                |
| Aayusha Ashikari    | `feature-restock` | Create the `restockItem()` method                                                   |
| Zigme Tanzing Lama  | `feature-menu`    | Create the user menu and integrate the methods in `main()`                          |
| Ryan Vollbrecht     | `feature-testing` | Test the program, check all possible cases and help resolve integration problems    |
| Ankur Basnet        | `feature-docs`    | Add Javadoc comments, generate the `docs/` folder, and review project documentation |


Git Workflow

Each team member should work on their assigned branch.

Do not push unfinished work directly to the `main` branch.

When your task is complete, create a Pull Request on GitHub so the team can review the changes before merging them into `main`.

Important Rules:
1. Always pull the newest version of `main` before starting new work.
2. Work only on your assigned branch.
3. Make clear commit messages.
4. Do not delete or rewrite another team member's code without discussing it first.
5. Use Pull Requests before merging into `main`.
6. Test your code before requesting a merge.
7. Let the team know if your changes affect another person's section.


* Javadoc comment for the program class
* Javadoc comment for `main()`
* Javadoc comment for `printInventory()`
* Javadoc comment for `restockItem()`
* Generated Javadoc files inside the `docs/` folder

---

Testing Checklist

Before submitting, verify that:

* [ ] The program compiles without errors
* [ ] Inventory displays correctly
* [ ] Empty array slots are not displayed
* [ ] Existing items can be restocked
* [ ] `"Item not found."` appears for an invalid item
* [ ] The menu repeats until the user selects Exit
* [ ] All three parallel arrays remain synchronized
* [ ] Javadoc comments are included
* [ ] The `docs/` folder is included
* [ ] All team members contributed through their own branches
* [ ] All completed branches were merged into `main`
* [ ] The Professor has been added as a repository collaborator

---

## Final Submission

Only the GitHub repository URL will be submitted.

Before submission, make sure the final version of the project is available on the `main` branch.
