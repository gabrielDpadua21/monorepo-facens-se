import Home from 'views/home.js';
import Maker from 'views/pages/maker';
import NewLogin from 'views/pages/NewLogin';
import NewRegister from 'views/pages/NewRegister';
import HelpCv from 'views/pages/helpCv';
import HelpLinkedin from 'views/pages/helpLinkedin';
import Profile from "views/pages/Profile";
import Config from 'views/pages/config';
import Preview from 'views/pages/Preview';

var routes = [
  {
    path: "/index",
    name: "Home",
    icon: "ni ni-tv-2 text-primary",
    component: Home,
    layout: "/admin",
    show: true
  },
  {
    path: "/maker",
    name: "Criar currículo",
    icon: "ni ni-collection text-primary",
    component: Maker,
    layout: "/admin",
    show: true
  },
  {
    path: "/help-cv",
    name: "Dicas para montar currículo",
    icon: "ni ni-air-baloon text-blue",
    component: HelpCv,
    layout: "/admin",
    show: true
  },
  {
    path: "/help-linkedin",
    name: "Dicas para Linkedin",
    icon: "ni ni-air-baloon text-primary",
    component: HelpLinkedin,
    layout: "/admin",
    show: true
  },
  {
    path: "/config",
    name: "Configurações",
    icon: "ni ni-settings text-primary",
    component: Config,
    layout: "/admin",
    show: true
  },
  {
    path: "/preview",
    name: "Preview",
    icon: "ni ni-settings text-primary",
    component: Preview,
    layout: "/admin",
  },
  {
    path: "/user-profile",
    name: "User Profile",
    icon: "ni ni-single-02 text-yellow",
    component: Profile,
    layout: "/admin",
  },
  {
    path: "/login",
    name: "Login",
    icon: "ni ni-key-25 text-info",
    component: NewLogin,
    layout: "/auth",
  },
  {
    path: "/register",
    name: "Register",
    icon: "ni ni-circle-08 text-pink",
    component: NewRegister,
    layout: "/auth",
  },
];
export default routes;
