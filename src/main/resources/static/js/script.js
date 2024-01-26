function successfullyLogout(){
    alert("You have been successfully logged out");
}

function validate_nr_tel_type() {
    var inputField = document.getElementById('phone_number');
    var errorMessage = document.getElementById('errorMessage');
    var submitButton = document.getElementById('submitButton');

    // Check if the input is a valid integer
    if (!/^\d+$/.test(inputField.value)) {
        // Show error message and disable the submit button
        errorMessage.innerHTML = 'Wartość musi zawierać cyfry.';
        errorMessage.style.color = 'red';
        submitButton.disabled = true;
    } else {
        // Clear error message and enable the submit button
        errorMessage.innerHTML = '';
        submitButton.disabled = false;
    }
}
