import React from 'react';
import {BrowserRouter, Route} from 'react-router-dom';

import Login from './pages/Login';
import Registre from './pages/Registre';
import Profile from './pages/Profile';
import Shelf from './pages/Shelf';
import Requests from './pages/Requests';

import LandingPage from './pages/LandingPage';

import ProductCreate from './pages/Product/create';
import ProductUpdate from './pages/Product/update';
import ProductDelete from './pages/Product/delete';

function Routes() {
    return (
        <BrowserRouter>
            <Route path="/" exact component={LandingPage}></Route>
            <Route path="/login" exact component={Login}></Route>
            <Route path="/registre" exact component={Registre}></Route>
            <Route path="/landing" exact component={LandingPage}></Route>
            <Route path="/profile" exact component={Profile}></Route>
            <Route path="/shelf" exact component={Shelf}></Route>
            <Route path="/requests" exact component={Requests}></Route>
            <Route path="/product/create" exact component={ProductCreate}></Route>
            <Route path="/product/update" exact component={ProductUpdate}></Route>
            <Route path="/product/delete" exact component={ProductDelete}></Route>
        </BrowserRouter>
    )
}

export default Routes;