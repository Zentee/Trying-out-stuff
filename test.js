let matrix = [
  [
    { product: "MacBook", price: 1019, category: "tech" },
    { product: "Cheerios", price: 5, category: "food" },
  ],

  [
    { product: "Snickers", price: 1.5, category: "food" },
    { product: "Air Pods", price: 129, category: "tech" },
  ],
];

function sortProducts(matrix) {
  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[i].length; j++) {
      console.log(matrix[j]);
    }
  }
}

sortProducts(matrix);
