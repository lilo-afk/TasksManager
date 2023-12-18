const button = document.querySelector(".add-task");
const modal = document.querySelector(".modal-form");
const closeModal = document.querySelector(".modal-form .close-modal");

button.onclick = function () {
  modal.showModal();
};

closeModal.onclick = function () {
  modal.close();
};
