document.addEventListener('DOMContentLoaded', () => {
    const library = document.getElementById('library');
    const colors = ['#ff6347', '#4682b4', '#32cd32', '#ffa500', '#6a5acd'];

    for (let i = 0; i < 4; i++) {
        const shelf = document.createElement('div');
        shelf.classList.add('shelf');

        for (let j = 0; j < 5; j++) {
            const row = document.createElement('div');
            row.classList.add('row');

            for (let k = 0; k < 10; k++) {
                const book = document.createElement('div');
                book.classList.add('book');
                book.style.backgroundColor = colors[Math.floor(Math.random() * colors.length)];
                book.style.height = `${Math.floor(Math.random() * 80) + 20}%`;
                row.appendChild(book);
            }

            shelf.appendChild(row);
        }

        library.appendChild(shelf);
    }
});