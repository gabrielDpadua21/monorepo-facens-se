/*eslint-disable*/
import React from "react";
import { Link } from "react-router-dom";

// @material-ui/core components
import { makeStyles } from "@material-ui/core/styles";
import List from "@material-ui/core/List";
import ListItem from "@material-ui/core/ListItem";
import Tooltip from "@material-ui/core/Tooltip";

// @material-ui/icons
import { AccountCircle, AddCircle, ShoppingCart } from "@material-ui/icons";

// core components
import Button from "../../components/CustomButtons/Button.js";

import styles from "../../assets/jss/material-kit-react/components/headerLinksStyle.js";

const useStyles = makeStyles(styles);

export default function HeaderLinks(props) {
  const classes = useStyles();

  const [data, setData] = React.useState([]);

  React.useEffect( async() => {
      const name = await handleUser();
      setData(name);
  }, []);

  const handleUser = async() => {
    const myName = await localStorage.getItem('userName');
    return [{"name": myName}];
  }

  return (
    <List className={classes.list}>
      <ListItem className={classes.listItem}>
        <Button
          href="#"
          color="transparent"
          target="_blank"
          className={classes.navLink}
        >
          Ola, { data[0] ? data[0].name : 'Gamer'}
        </Button>
        <Button
          href="/profile"
          color="transparent"
          target="_blank"
          className={classes.navLink}
        >
          <AccountCircle className={classes.icons} /> Perfil
        </Button>
        <Button
          href="/requests"
          color="transparent"
          target="_blank"
          className={classes.navLink}
        >
          <ShoppingCart className={classes.icons} /> Meus Pedidos
        </Button>
      </ListItem>
    </List>
  );
}
