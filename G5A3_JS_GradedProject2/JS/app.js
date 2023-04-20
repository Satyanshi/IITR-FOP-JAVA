function searchResume() {
    const searchInput = document.getElementById('search-input');
    const searchValue = searchInput.value.toLowerCase();
    const display = document.getElementById('resumeData');
    const noResume = document.getElementById('noResult');
    display.innerHTML = '';
    noResume.classList.add('hidden');
    let counter =0;

    fetch('../Data/Data.json')
    .then(res => res.json())
    .then(result => {
        result.resume.forEach(resume => {
           if(resume.basics.AppliedFor.toLowerCase().includes(searchValue)) {
            const resumeCard = document.createElement('div');
            resumeCard.className = 'resume-card';
            resumeCard.innerHTML = ` ${resume.basics.AppliedFor}
            <p>Name: ${resume.basics.name}</p>
            `;
            display.appendChild(resumeCard);
            console.log('main', resume);
            counter=counter+1;
           }
        })
        if(counter == 0) {
            noResume.classList.remove('hidden');
        }
    })
}
const searchInput = document.getElementById("search-input");
searchInput.addEventListener("keydown", async function(event) {
    if (event.key === "Enter") {
      const data = await searchResume();
    }
  });