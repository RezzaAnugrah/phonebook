const apiUrl = 'http://localhost:8080/V1.0/phonebook/';
const contactsTableBody = document.querySelector('#contactsTable tbody');
const contactForm = document.getElementById('contactForm');

// Fetch and display contacts
function loadContacts() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            contactsTableBody.innerHTML = '';
            data.forEach(contact => {
                const row = `<tr>
                    <td>${contact.name}</td>
                    <td>${contact.email}</td>
                    <td>${contact.phone}</td>
                    <td>
                        <button onclick="deleteContact(${contact.id})">Delete</button>
                    </td>
                </tr>`;
                contactsTableBody.insertAdjacentHTML('beforeend', row);
            });
        })
        .catch(error => console.error('Error:', error));
}

// Add a new contact
contactForm.addEventListener('submit', function(event) {
    event.preventDefault();
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const phone = document.getElementById('phone').value;

    const contact = { name, email, phone };

    fetch(apiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(contact),
    })
    .then(response => response.json())
    .then(data => {
        loadContacts();  // Reload contacts after adding
    })
    .catch(error => console.error('Error:', error));

    contactForm.reset();
});

// Delete a contact
function deleteContact(id) {
    fetch(`${apiUrl}/${id}`, {
        method: 'DELETE',
    })
    .then(() => loadContacts())
    .catch(error => console.error('Error:', error));
}

// Load contacts on page load
loadContacts();
