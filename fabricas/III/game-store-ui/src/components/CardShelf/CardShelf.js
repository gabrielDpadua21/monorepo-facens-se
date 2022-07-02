import React from "react";
import Axios from "axios";
// material-ui components
import { makeStyles } from "@material-ui/core/styles";
import { toast, ToastContainer } from 'react-toastify';
// core components
import Card from "../Card/Card.js";
import CardBody from "../Card/CardBody.js";
import Button from "../CustomButtons/Button.js";
import Slide from "@material-ui/core/Slide";
import Dialog from "@material-ui/core/Dialog";
import DialogTitle from "@material-ui/core/DialogTitle";
import DialogContent from "@material-ui/core/DialogContent";
import DialogActions from "@material-ui/core/DialogActions";
import IconButton from "@material-ui/core/IconButton";

import imagesStyles from "../../assets/jss/material-kit-react/imagesStyles.js";
import { cardTitle } from "../../assets/jss/material-kit-react.js";
// @material-ui/icons
import Close from "@material-ui/icons/Close";


import defaultImage from '../../assets/images/temp/control.jpg';

const styles = {
  ...imagesStyles,
  cardTitle,
};

const Transition = React.forwardRef(function Transition(props, ref) {
  return <Slide direction="down" ref={ref} {...props} />;
});

const useStyles = makeStyles(styles);

export default function Cards(props) {
  const [modal, setModal] = React.useState(false);
  const { img, title, description, price, id } = props;

  const handleSubmitOrder = (product) => {
    const userId = localStorage.getItem('userId');
    Axios.post(`${process.env.REACT_APP_API_HOST}/orders`, {productId: product, userId: userId})
    .then(response =>{
      console.log(response);
    }).catch(error => {
      console.log(error);
      toast.error('PRODUTO INDISPONIVEL NO MOMENTO!!!');
    })
    setModal(false);
  } 

  const classes = useStyles();
  return (
    <div>
      <ToastContainer />
      <Card style={{width: "100%"}}>
      <img
        style={{height: "180px", width: "100%", display: "block"}}
        className={classes.imgCardTop}
        src={ img ? img : defaultImage}
        alt="Card-img-cap"
      />
      <CardBody>
        <h4 className={classes.cardTitle}>{title}</h4>
        <p>{description}</p>
        <Button color="danger" onClick={() => setModal(true)}>Comprar</Button>
      </CardBody>
    </Card>
    <Dialog
        classes={{
          root: classes.center,
          paper: classes.modal
        }}
        open={modal}
        TransitionComponent={Transition}
        keepMounted
        onClose={() => setModal(false)}
        aria-labelledby="modal-slide-title"
        aria-describedby="modal-slide-description"
      >
        <DialogTitle
          id="classic-modal-slide-title"
          disableTypography
          className={classes.modalHeader}
        >
          <IconButton
            className={classes.modalCloseButton}
            key="close"
            aria-label="Close"
            color="inherit"
            onClick={() => setModal(false)}
          >
            <Close className={classes.modalClose} />
          </IconButton>
        <h4 className={classes.modalTitle}>Produto: {title}</h4>
        <h4 className={classes.modalTitle}>Valor: R$ {price}</h4>
        </DialogTitle>
        <DialogContent
          id="modal-slide-description"
          className={classes.modalBody}
        >
          <h5>Deseja Finalizar compra?</h5>
        </DialogContent>
        <DialogActions
          className={classes.modalFooter + " " + classes.modalFooterCenter}
        >
          <Button onClick={() => setModal(false)} color="danger">Cancelar</Button>
          <Button onClick={() => handleSubmitOrder(id)} color="success">
            Finalizar
          </Button>
        </DialogActions>
      </Dialog>
    </div>
  );
}