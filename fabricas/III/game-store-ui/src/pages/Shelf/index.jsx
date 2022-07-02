import React from "react";
import Axios from "axios";
// nodejs library that concatenates classes
import classNames from "classnames";
// @material-ui/core components
import { makeStyles } from "@material-ui/core/styles";

// core components
import Header from "../../components/HeaderLogged/Header.js";
import Footer from "../../components/Footer/Footer.js";
import GridContainer from "../../components/Grid/GridContainer.js";
import GridItem from "../../components/Grid/GridItem.js";
import HeaderLinks from "../../components/HeaderLogged/HeaderLinks.js";
import Parallax from "../../components/Parallax/Parallax.js";
import CardShelf from "../../components/CardShelf/CardShelf.js";

// react component for creating beautiful carousel
import Carousel from "react-slick";
import Card from "../../components/Card/Card.js";

import styles from "../../assets/jss/material-kit-react/views/profilePage.js";

import LogoHorizontal from '../../assets/images/logos/logo-horizontal.svg';

import image1 from "../../assets/images/temp/banner1.jpg";
import image2 from "../../assets/images/temp/banner2.jpg";

const useStyles = makeStyles(styles);

export default function ShelfPage(props) {

  const [data, setData] = React.useState([]);
 
  React.useEffect(async () => {
      const {data} = await handleLoadShelf();
      setData(data);
  }, []);

  const handleLoadShelf = async () => {
     return await Axios.get(`${process.env.REACT_APP_API_HOST}/product`);
  }
  
  const settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 1,
    slidesToScroll: 1,
    autoplay: true
  };

  const classes = useStyles();
  const { ...rest } = props;
  return (
    <div>
      <Header
        brand={LogoHorizontal}
        color="transparent"
        rightLinks={<HeaderLinks />}
        fixed
        changeColorOnScroll={{
          height: 200,
          color: "white"
        }}
        {...rest}
      />
      <Parallax small filter image={require("../../assets/images/bg.png")} />
      <div className={classNames(classes.main, classes.mainRaised)}>
        <div>
          <div className={classes.container}>
            <GridContainer justify="center">
            <GridItem xs={12} sm={12} md={12}>
              <Card>
                <Carousel {...settings}>
                  <div>
                    <img
                      src={image1}
                      alt="First slide"
                      className="slick-image"
                    />
                  </div>
                  <div>
                    <img
                      src={image2}
                      alt="Second slide"
                      className="slick-image"
                    />
                  </div>
                </Carousel>
              </Card>
            </GridItem>
              {data.map(item =>(
                <GridItem xs={12} sm={6} md={4}>
                  <CardShelf img={item.imageUri} title={item.name} description={item.description} price={item.price} id={item.id}/>
                </GridItem>
              ))}
            </GridContainer>
          </div>
        </div>
      </div>
      <Footer />
    </div>
  );
}
