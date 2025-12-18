// src/main/resources/static/script.js

// all images, exactly as in your static/images folder
const imagesByBedrooms = {
    1: [
        '/images/3d_1bhk(1).jpg',
        '/images/3d_1bhk(2).jpg',
        '/images/3d_1bhk(3).jpg',
        '/images/3d_1bhk(4).jpg',
        '/images/3d_1bhk(5).jpg',
        '/images/3d_1bhk(6).jpg'
    ],
    2: [
        '/images/3d_2bhk(1).jpg',
        '/images/3d_2bhk(2).jpg',
        '/images/3d_2bhk(3).jpg',
        '/images/3d_2bhk(4).jpg',
        '/images/3d_2bhk(5).jpg',
        '/images/3d_2bhk(6).jpg',
        '/images/3d_2bhk(7).jpg',
        '/images/3d_2bhk(8).jpg',
        '/images/3d_2bhk(9).jpg'
    ],
    3: [
        '/images/3d_3bhk(1).jpg',
        '/images/3d_3bhk(2).jpg',
        '/images/3d_3bhk(3).jpg',
        '/images/3d_3bhk(4).jpg',
        '/images/3d_3bhk(5).jpg',
        '/images/3d_3bhk(6).jpg'
    ]
};

let currentList = imagesByBedrooms[1];
let currentIndex = 0;

function showCurrentImage() {
    const img = document.getElementById('planImage');
    img.src = currentList[currentIndex];
}

document.addEventListener('DOMContentLoaded', () => {
    const bedroomsInput    = document.getElementById('bedrooms');
    const bathroomsInput   = document.getElementById('bathrooms');
    const kitchensInput    = document.getElementById('kitchens');
    const livingRoomsInput = document.getElementById('livingRooms');
    const errorBox         = document.getElementById('formError');

    const generateBtn = document.getElementById('generateBtn');
    const prevBtn     = document.getElementById('prevBtn');
    const nextBtn     = document.getElementById('nextBtn');

    generateBtn.addEventListener('click', () => {
        const bedrooms    = parseInt(bedroomsInput.value || '1', 10);
        const bathrooms   = parseInt(bathroomsInput.value || '1', 10);
        const kitchens    = parseInt(kitchensInput.value || '1', 10);
        const livingRooms = parseInt(livingRoomsInput.value || '1', 10);

        if (bathrooms !== 1 || kitchens !== 1 || livingRooms !== 1) {
            errorBox.textContent = 'For this demo bathrooms, kitchens and living rooms must all be 1.';
            errorBox.style.display = 'block';
            return;
        }
        if (bedrooms < 1 || bedrooms > 3) {
            errorBox.textContent = 'Bedrooms must be between 1 and 3.';
            errorBox.style.display = 'block';
            return;
        }

        errorBox.style.display = 'none';
        currentList = imagesByBedrooms[bedrooms];
        currentIndex = 0;
        showCurrentImage();
    });

    prevBtn.addEventListener('click', () => {
        currentIndex = (currentIndex - 1 + currentList.length) % currentList.length;
        showCurrentImage();
    });

    nextBtn.addEventListener('click', () => {
        currentIndex = (currentIndex + 1) % currentList.length;
        showCurrentImage();
    });

    // show the first 1BHK image on load
    showCurrentImage();
});