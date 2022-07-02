import {
    Box,
    Center,
    useColorModeValue,
    Heading,
    Text,
    Stack,
    Image,
    Button,
    Drawer,
    useDisclosure,
    DrawerOverlay,
    DrawerContent,
    DrawerHeader,
    DrawerBody
} from '@chakra-ui/react';

import { useState } from 'react';
import Checkout from './checkout';

const DEFAULT_IMAGE = '/images/shelf-default.jpg'

const StoreCard = (props: any) => {
    const { name, category, price } = props;
    const { isOpen, onOpen, onClose } = useDisclosure()
    const [placement, setPlacement] = useState<string>('right')

    return (
      <>
        <Center py={12}>
          <Box
            role={'group'}
            p={6}
            maxW={'530px'}
            w={'full'}
            bg={useColorModeValue('white', 'gray.800')}
            boxShadow={'2xl'}
            rounded={'lg'}
            pos={'relative'}
            zIndex={0}>
            <Box
              rounded={'lg'}
              mt={-12}
              pos={'relative'}
              height={'230px'}
              _after={{
                transition: 'all .3s ease',
                content: '""',
                w: 'full',
                h: 'full',
                pos: 'absolute',
                top: 5,
                left: 0,
                backgroundImage: `url(${props.image || DEFAULT_IMAGE})`,
                filter: 'blur(15px)',
                zIndex: -1,
              }}
              _groupHover={{
                _after: {
                  filter: 'blur(20px)',
                },
              }}>
              <Image
                rounded={'lg'}
                height={230}
                width={482}
                objectFit={'cover'}
                src={props.image || DEFAULT_IMAGE}
              />
            </Box>
            <Stack pt={10} align={'center'}>
              <Text color={'gray.500'} fontSize={'sm'} textTransform={'uppercase'}>
                {category || 'Categoria'}
              </Text>
              <Heading fontSize={'2xl'} fontFamily={'body'} fontWeight={500}>
                {name || 'Nome' }
              </Heading>
              <Stack direction={'row'} align={'center'}>
                <Text fontWeight={800} fontSize={'xl'}>
                  R$ {price || 'Preço'}
                </Text>
              </Stack>
              <Stack direction={'row'} align={'center'}>
                  <Button colorScheme="blue" variant="outline" onClick={onOpen}>
                      Comprar
                  </Button>
                  <Button colorScheme="blue" variant="link">
                      Info
                  </Button>
              </Stack>
            </Stack>
          </Box>
        </Center>
        <Drawer onClose={onClose} isOpen={isOpen} size={'md'}>
          <DrawerOverlay />
          <DrawerContent>
            <DrawerHeader borderBottomWidth='1px'>
               CHECKOUT
            </DrawerHeader>
            <DrawerBody>
              <Checkout name={props.name} imageUrl={props.image} price={props.price} />
            </DrawerBody>
          </DrawerContent>
        </Drawer>
      </>
    );
}

export default StoreCard;