let copybtn = document.getElementById("btn");

copybtn.addEventListener("click", () => {
  let writeText = document.getElementById("text");
  let a = writeText.value;

  navigator.clipboard.writeText(a).then(() => {
      let copiedText = document.querySelector(".copied");
      copiedText.classList.add("bounce-effect");

    
      setTimeout(() => {
        copiedText.classList.remove("bounce-effect");
      }, 1000);

      writeText.value = "";
    })
    .catch((err) => console.error("Error copying text: ", err));
});
