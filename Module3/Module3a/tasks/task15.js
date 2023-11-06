const books = [
    {
        title: "The secret lives of Baba Segi's wives", 
        description: "A book written by Nigerian author Lola Shoneyin about a man with 3 wives who fought over his inheritance after his death", 
        numberOfPages: 245,
        authour: "Lola Shoneyin",
        reading: true
    },
    {
        title: "Verity",
        description: "A proising romantic thriller. Promises to leave you on the edge of your seat", 
        numberOfPages: 578,
        authour: "Coleen Hoover",
        reading: false
    },
    {
        title: "The Psychology of Money",
        description: "Teaching some very powerful financial literacy tips", 
        numberOfPages: 578,
        authour: "Morgan Housel",
        reading: false
    },
    {
        title: "The Song of Achilles",
        description: "Greek mythology fandom", 
        numberOfPages: 1098,
        authour: "Madeline Miller",
        reading: true
    }
]

for (let i = 0; i < books.length; i++) {
    if (books[i].reading === true) {
        console.log(books[i]);
    
}
}