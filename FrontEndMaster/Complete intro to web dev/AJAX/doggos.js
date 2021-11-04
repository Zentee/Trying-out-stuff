const DOG_URL = "https://dog.ceo/api/breeds/image/random";

const promise = fetch(DOG_URL);
const doggos = document.querySelector(".doggos");
const addDoggo = document.querySelector(".dog-gallery");

promise
  .then(function (response) {
    const processingPromise = response.json();
    return processingPromise;
  })
  .then(function (processedResponse) {
    const img = document.createElement("img");
    img.src = processedResponse.message;
    img.alt = "Cute doggo";
    doggos.appendChild(img);
  });

function addNewDoggo() {
  const promise = fetch(DOG_URL);
  promise
    .then(function (response) {
      const processingPromise = response.json();
      return processingPromise;
    })
    .then(function (processedResponse) {
      const img = document.createElement("img");
      img.src = processedResponse.message;
      img.alt = "Cute Doggo";
      addDoggo.appendChild(img);
    });
}

document.querySelector(".add-doggo").addEventListener("click", addNewDoggo);
