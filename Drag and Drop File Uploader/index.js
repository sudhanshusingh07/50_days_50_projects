const input = document.querySelector("#input-file");
const dropArea = document.querySelector("#drop-area");
const imgview = document.querySelector("#img-view");

const uploadImg = () => {
  let imgLink = URL.createObjectURL(input.files[0]);
  imgview.style.backgroundImage = `url(${imgLink})`;
  imgview.textContent = "";
  imgview.style.border = "none";
};

input.addEventListener("change", uploadImg);

dropArea.addEventListener("dragover", (e) => {
  e.preventDefault(); 
});

dropArea.addEventListener("drop", (e) => {
  e.preventDefault();

  
    input.files = e.dataTransfer.files;

   
    uploadImg();
  
});
