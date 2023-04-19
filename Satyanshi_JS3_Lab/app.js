async function Weather() {
    const location = document.getElementById('search-input').value;
    const response = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${location}&units=metric&appid=7e3f21edee540e6110af347b55eb1ab2`);
    const weatherData = await response.json();
    console.log('weatherData', weatherData);
    document.getElementById('location-value').innerText = `${weatherData.name}, ${weatherData.sys.country}`;

    document.getElementById('date').innerText = new Date(weatherData.dt * 1000).toLocaleDateString('en-US', {
        weekday: 'long',
        day: 'numeric',
        month: 'long',
        year: 'numeric'
      }).replace(',', '');
    
    const temperatureElement = document.getElementById('temperature');
    temperatureElement.innerHTML = `${weatherData.main.temp.toFixed(2)}&deg;C<br><br>`;
    temperatureElement.innerHTML += `${weatherData.weather[0].description.charAt(0).toUpperCase() + weatherData.weather[0].description.slice(1)}`;
   
}
const searchInput = document.getElementById("search-input");

searchInput.addEventListener("keydown", async function(event) {
  if (event.key === "Enter") {
    const data = await Weather();
  }
});