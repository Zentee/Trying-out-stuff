import LocationImg from "../img/locationImg.png";

export default function Card(props) {
  // console.log(props);
  const dates = `${props.card.startDate} - ${props.card.endDate}`;

  return (
    <section className="card-container">
      <div className="card-layout">
        <img className="card-img" src={props.card.imageUrl} />
        <div className="card-layout-col">
          <div className="card-layout-row">
            <img src={LocationImg} />
            <p className="card-country-name">{props.card.location}</p>
            <a className="card-google-link" href={props.card.googleMapsUrl}>
              View on Google Maps
            </a>
          </div>
          <h2 className="card-location-name">{props.card.title}</h2>
          <p className="card-dates">{dates}</p>
          <p className="card-text">{props.card.description}</p>
        </div>
      </div>
    </section>
  );
}
