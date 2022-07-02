import React from 'react';
import {
  Box,
  IconButton,
  useBreakpointValue,
  Container,
  Stack,
  Text,
  Heading,
  Flex,
  Button
} from '@chakra-ui/react';

import { BiLeftArrowAlt, BiRightArrowAlt } from 'react-icons/bi';

import Slider from 'react-slick';
import HomeNav from './nav';

// Settings for the slider
const settings = {
  dots: true,
  arrows: false,
  fade: true,
  infinite: true,
  autoplay: true,
  speed: 100,
  autoplaySpeed: 5000,
  slidesToShow: 1,
  slidesToScroll: 1,
};

export default function HomeCarousel() {
  const [slider, setSlider] = React.useState<Slider | null>(null);

  const top = useBreakpointValue({ base: '90%', md: '50%' });
  const side = useBreakpointValue({ base: '30%', md: '40px' });

  const cards = [
    {
      image: '/images/banner01.gif',
      mobileImage: '/images/mobile01.jpg'
    },
    {
      image: '/images/banner02.jpg',
      mobileImage: '/images/banner01.jpg'
    },
    {
      image: '/images/banner03.jpg',
      mobileImage: '/images/mobile03.jpg'
    },
    {
      image: '/images/banner04.jpg',
      mobileImage: '/images/banner01.jpg'
    },
  ];

  return (
    <Box
      position={'relative'}
      height={'1024'}
      width={'full'}
      overflow={'hidden'}>
      <link
        rel="stylesheet"
        type="text/css"
        charSet="UTF-8"
        href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick.min.css"
      />
      <link
        rel="stylesheet"
        type="text/css"
        href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick-theme.min.css"
      />
      <HomeNav />
      <Box
        w={'100%'}
        h={'100%'}
        position={'absolute'}
        left={'0'}
        top={'0'}
        transition={'opacity 0.5s'}
        bg={'rgba(0,0,0,0.7)'}
        zIndex={'1'}
      >
        <Flex
          minH={'100vh'}
          align={'center'}
          justify={'center'}
          direction={'column'}
        >
          <Text fontSize={{ base: '3xl', md: '4xl', lg: '5xl' }} color={'white'} fontWeight='700'>
              Melhores games da atualidade e muito
          </Text>
          <Text fontSize={{ base: '3xl', md: '4xl', lg: '5xl' }} color={'white'} fontWeight='700'>
              mais. Sem Limites
          </Text>
          <Text fontSize={{ base: '1xl', md: '2xl', lg: '3xl' }} color={'white'} fontWeight='500'>
              Compre de qualquer lugar e jogue em qualquer plataforma.
          </Text>
          <Button 
            _hover={{color: 'blue.700', bg:'white'}} 
            outline={'none'} 
            fontSize={{base: '4xl'}} 
            bg={'blue.700'} 
            color={'white'} 
            mt={'20'} p={'10'}
            transition={'ease-in 6.s'}
            as='a'
            href={'/auth/register'}
          >
            Faça seu cadastro
          </Button>
        </Flex>
      </Box>
      <Slider {...settings} ref={(slider: any) => setSlider(slider)}>
        {cards.map((card, index) => (
          <Box
            key={index}
            height={'6xl'}
            position="relative"
            backgroundPosition="center"
            backgroundRepeat="no-repeat"
            backgroundSize="cover"
            backgroundImage={{base: `url(${card.mobileImage})`, md:`url(${card.image})`, lg: `url(${card.image})`}}>
          </Box>
        ))}
      </Slider>
    </Box>
  );
}