# Library Management System

## Overview
This Library Management System allows users to interactively manage a collection of books. Users can add books to their library, remove them, and display all items in the library. It supports both novels and art albums with specific attributes for each type.

## Features
- **Add Books**: Users can add up to three books, providing details like book name, number of pages, and specific attributes based on the book type (novel or art album).
- **Remove Books**: Users can remove a book from their library.
- **Display Library**: The system displays all books currently in the library with their details.

## Usage

### Adding Books
1. Enter the name of the book.
2. Specify the number of pages.
3. Indicate the type of the book (Novel or Art Album) by entering 'N' for Novel or 'A' for Art Album.
4. Based on the book type, enter the type of the novel (e.g., Fantasy) or the quality of the paper for an art album.

### Removing Books
1. Indicate whether you want to remove a book by entering 'Y' for Yes or 'N' for No.
2. If 'Y' is selected, choose which book to delete by entering the corresponding number (1, 2, or 3).

### Displaying the Library
- After adding or removing books, the system automatically displays the current state of the library, listing all the books with their details.

## Example
Enter the first book name

THE FELLOWSHIP OF THE RING
Enter the number of pages
423
It's a Novel or an Art Album? (enter only N or A)
N
Enter the type of the novel:
FANTASY

... [Further interactions follow the same pattern]

This is the current library:
Novel: THE FELLOWSHIP OF THE RING, type: FANTASY (423 pages)
Art Album: FAMILY ALBUM, paper quality GOOD (23 pages)
Novel: THE RETURN OF THE KING, type: FANTASY (416 pages)

Want to remove a book? Y/N

Y
Choose which book to delete 1,2 or 3:
2

This is the new library:
Novel: THE FELLOWSHIP OF THE RING, type: FANTASY (423 pages)
Novel: THE RETURN OF THE KING, type: FANTASY (416 pages)
----------------END----------------
