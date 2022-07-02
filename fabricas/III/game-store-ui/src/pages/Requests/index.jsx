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
import styles from "../../assets/jss/material-kit-react/views/profilePage.js";
import LogoHorizontal from '../../assets/images/logos/logo-horizontal.svg';

import List from '@material-ui/core/List';
import ListItem from '@material-ui/core/ListItem';
import ListItemText from '@material-ui/core/ListItemText';
import ListItemAvatar from '@material-ui/core/ListItemAvatar';
import Avatar from '@material-ui/core/Avatar';
import AttachMoneyIcon from '@material-ui/icons/AttachMoney';
import Button from "../../components/CustomButtons/Button.js";

const useStyles = makeStyles(styles);

export default function RequestsPage(props) {
  const classes = useStyles();
  const { ...rest } = props;
  const imageClasses = classNames(
    classes.imgRaised,
    classes.imgRoundedCircle,
    classes.imgFluid
  );

  const [requests, setRequests] = React.useState([]);

  React.useEffect(async () => {
    const {data} = await handleLoadShelf();

    console.log(data);

    const userId = localStorage.getItem('userId');

    const filterData = await data.filter(item => {
      return item.client.id == userId;
    });

    setRequests(filterData);

}, []);

const handleLoadShelf = async () => {
   return await Axios.get(`${process.env.REACT_APP_API_HOST}/orders`);
}

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
              <GridItem xs={12} sm={12} md={6}>
                <List>
                  {requests ? requests.map(item =>(
                    <ListItem>
                        <ListItemAvatar>
                            <Avatar>
                              <AttachMoneyIcon />
                            </Avatar>
                            </ListItemAvatar>
                            <ListItemText primary={item.items[0].product.name} secondary={item.createdAt} />
                          { item.orderStatus == 2 ? <Button color="danger">PENDENTE</Button> : <Button color="success">PAGO</Button> }
                    </ListItem>
                  )) : <ListItem>
                    <h1>
                      NENHUM PEDIDO
                    </h1>
                  </ListItem>}
                </List>
              </GridItem>
            </GridContainer>
          </div>
        </div>
      </div>
      <Footer />
    </div>
  );
}
