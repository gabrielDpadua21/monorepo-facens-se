import {
    Box,
    SimpleGrid,
    Text,
    Input,
    Flex,
    Tooltip,
    IconButton
} from '@chakra-ui/react'
import {
    ArrowRightIcon,
    ArrowLeftIcon
} from "@chakra-ui/icons";
import StoreCardImage from './cardImage';
import { Games } from '../../interfaces/games';
import { User } from '../../interfaces/user';

type IShelfProps = {
    games: Games[]
    user: User
}

const StoreShelfe: React.FC<IShelfProps> = (props: IShelfProps) => {
    return (
        <>
            <Box maxW="64rem" px={12} pt={10}>
                <Text mb={4} align={{base: 'center', lg:'left'}} fontSize={{base: '2xl', lg:'4xl'}} fontWeight='700'>
                    Catálogo de jogos
                </Text>
                <Text fontSize={{base: 'md', lg: 'lg'}} align={{base: 'center', lg: 'left'}}>
                    Temos o maior catálogo de jogos da atualidade, procure os todos os jogos que desejar.
                </Text>
            </Box>
            <Box px={12} pt={10} pb={10}>
                <Input placeholder='Pesquisar' />
            </Box>
            <SimpleGrid columns={{ base: 1, md: 2, lg: 2, xl: 4}} spacing={10} px={10}>
                {props.games.map((game) => {
                    return (
                        <Box key={game.id}>
                            <StoreCardImage
                                user={props.user}
                                id={game.id}
                                name={game.name} 
                                category={game.category} 
                                price={game.price}
                                image={game.imageUrl}
                            />
                        </Box>
                    )
                })}
            </SimpleGrid>
            <Flex justifyContent='space-between' m={10} alignItems='center'>
                <Flex>
                    <Tooltip label='Próxima'>
                        <IconButton
                            aria-label=''
                            icon={<ArrowLeftIcon h={3} w={3}/>}
                        />
                    </Tooltip>
                </Flex>
                <Flex alignItems='center'>
                    <Text flexShrink="0" mr={8}>
                         Pagina{" "}
                        <Text fontWeight="bold" as="span">
                         1
                        </Text>{" "}
                         de{" "}
                        <Text fontWeight="bold" as="span">
                         1
                        </Text>
                    </Text>
                </Flex>
                <Flex>
                    <Tooltip label='Anterior'>
                        <IconButton
                            aria-label=''
                            icon={<ArrowRightIcon h={3} w={3}/>}
                        />
                    </Tooltip>
                </Flex>
            </Flex>
        </>
    )
} 

export default StoreShelfe;