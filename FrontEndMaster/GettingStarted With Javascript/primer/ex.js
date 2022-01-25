// TODO: define addFavoriteBook(..) function

function addFavoriteBook(bookName) {
  if (!bookName.includes("Great")) {
    favoriteBooks.push(bookName);
  }
}

// TODO: define printFavoriteBooks() function

var favoriteBooks = [];

addFavoriteBook("A Song of Ice and Fire");
addFavoriteBook("The Great Gatsby");
addFavoriteBook("Crime & Punishment");
addFavoriteBook("Great Expectations");
addFavoriteBook("You Don't Know JS");

console.log(favoriteBooks);

// TODO: print out favorite books

function printFavoriteBooks() {
  console.log("This array has " + favoriteBooks.length);
  console.log(`Favorite Books: ${favoriteBooks.length}`);
  for (i = 0; i < favoriteBooks.length; i++) {
    console.log("Favourite books: " + favoriteBooks(i));
  }

  for (let favoriteBook of favoriteBooks) {
    console.log("Favourite books: " + favoriteBook);
  }
}
